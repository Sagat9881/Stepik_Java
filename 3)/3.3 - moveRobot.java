// 3.3 - В начальный момент робот находится в некоторой позиции на поле. 
// Также известно, куда робот смотрит: вверх, вниз, направо или налево. 
// Ваша задача — привести робота в заданную точку игрового поля.

public static void moveRobot(Robot robot, int toX, int toY) {
    if(robot.getX()>toX){
        while(robot.getDirection()!=Direction.LEFT){robot.turnLeft();}
        while(robot.getX()!=toX){robot.stepForward();}          
    }else {while(robot.getDirection()!=Direction.RIGHT){robot.turnRight();}
    while(robot.getX()!=toX){robot.stepForward();}
    }
if(robot.getY()>toY){
    while(robot.getDirection()!=Direction.DOWN){robot.turnLeft();}
        while(robot.getY()!=toY){robot.stepForward();}          
    }else{while(robot.getDirection()!=Direction.UP){robot.turnRight();}
    while(robot.getY()!=toY){robot.stepForward();}
}
}
