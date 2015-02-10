var cubeNoFloor = function(dimension, horizontalOffset, verticalOffset, x, y, z) 
{
    if (checkCubeNoFloor(dimension, horizontalOffset, verticalOffset, x, y, z)) 
		return 4;
};

var checkCubeNoFloor = function(dimension, horizontalOffset, verticalOffset, x, y, z) 
{
    return ((x == horizontalOffset 
		|| x == horizontalOffset + dimension - 1 
		|| z == horizontalOffset 
		|| z == horizontalOffset + dimension - 1
		|| y == verticalOffset + dimension) 
		&& y > verticalOffset
		&& x < horizontalOffset + dimension 
		&& x >= horizontalOffset 
		&& z >= horizontalOffset 
		&& z < horizontalOffset + dimension 
		&& y < verticalOffset + dimension + 1);
};

var checkCubeDoor = function(direction, dimension, horizontalOffset, verticalOffset, x, y, z) 
{
	var position = Math.floor(dimension / 2);
	return checkCubeOpening(direction, 1, position, dimension, horizontalOffset, verticalOffset, x, y, z)
		   && checkCubeOpening(direction, 2, position, dimension, horizontalOffset, verticalOffset, x, y, z);
};

var checkCubeWindows = function(dimension, horizontalOffset, verticalOffset, x, y, z) 
{
	var position1 = Math.floor(dimension * 1/3);
	var position2 = Math.floor(dimension * 2/3);
	var height = Math.floor(dimension * 2/3);
		
	return checkCubeOpening(0, height, position1, dimension, horizontalOffset, verticalOffset, x, y, z)
		   && checkCubeOpening(0, height, position2, dimension, horizontalOffset, verticalOffset, x, y, z)
		   && checkCubeOpening(1, height, position1, dimension, horizontalOffset, verticalOffset, x, y, z)
		   && checkCubeOpening(1, height, position2, dimension, horizontalOffset, verticalOffset, x, y, z)
		   && checkCubeOpening(2, height, position1, dimension, horizontalOffset, verticalOffset, x, y, z)
		   && checkCubeOpening(2, height, position2, dimension, horizontalOffset, verticalOffset, x, y, z)
		   && checkCubeOpening(3, height, position1, dimension, horizontalOffset, verticalOffset, x, y, z)
		   && checkCubeOpening(3, height, position2, dimension, horizontalOffset, verticalOffset, x, y, z);
};

var checkCubeOpening = function(direction, height, position, dimension, horizontalOffset, verticalOffset, x, y, z) 
{
	var xPosition = horizontalOffset;
	var zPosition = horizontalOffset + position;
	
	if (direction == 1)
	{
		xPosition = horizontalOffset + position;
		zPosition = horizontalOffset;
	}
	else if (direction == 2)
	{
		xPosition = horizontalOffset + position;
		zPosition = horizontalOffset + dimension - 1;
	}
	else if (direction == 3)
	{
		xPosition = horizontalOffset + dimension - 1;
		zPosition = horizontalOffset + position;
	}

    return (!(x == xPosition && z == zPosition && (y == verticalOffset + height)));
};

var cubeNoFloorWithDoorAndWindows = function(dimension, horizontalOffset, verticalOffset, x, y, z) 
{
    if (checkCubeNoFloor(dimension, horizontalOffset, verticalOffset, x, y, z)
		&& checkCubeDoor(0, dimension, horizontalOffset, verticalOffset, x, y, z)
		&& checkCubeDoor(1, dimension, horizontalOffset, verticalOffset, x, y, z)
		&& checkCubeDoor(2, dimension, horizontalOffset, verticalOffset, x, y, z)
		&& checkCubeDoor(3, dimension, horizontalOffset, verticalOffset, x, y, z)
		&& checkCubeWindows(dimension, horizontalOffset, verticalOffset, x, y, z))
			return 4;
};

var flatLands = function(x, y, z)
{
	if (y === 1) 
		return Math.floor(Math.random()*3)+ 1;
}

var generateStructures = function(x, y, z)
{
  var dimension = 10;
  var horizontalOffset = 7;
  var verticalOffset = 1;
  
  var id = flatLands(x, y, z)
  if (id !== undefined)
	return id;
	
  id = cubeNoFloorWithDoorAndWindows(dimension, horizontalOffset, verticalOffset, x, y, z);
  if (id !== undefined)
	return id;
	
  return 0;
}


var createGame = require('voxel-hello-world')
var game = createGame({
  generate: function(x, y, z) {
	return generateStructures(x, y, z);
  },
  materials: ["#336600", "#339900", "#669900", "#000066"],
  materialFlatColor: true
})