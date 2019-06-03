//declare a constant with the value of gravity
static double GRAVITY_VALUE = 9.81;

double potentialEnergy(double mass, double height) {
  return mass * height * GRAVITY_VALUE;
}