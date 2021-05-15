/* PROGRAM TO DRAW POINTS ON PLANE */

# include <GL/glut.h>

void display () {
	glClear (GL_COLOR_BUFFER_BIT);
	glColor3f (1.0,0.0,0.0);
	glBegin (GL_POINTS);
	glVertex2f (150.0,80.0);
	glVertex2f(150.0,185.0);
	glVertex2f(100.0,20.0);
	glVertex2f(200.0,100.0);
	glEnd ();
	glFlush ();
}

void myinit () {
	glClearColor (0.0,0.0,0.0,0.0);
	glColor3f (1.0,0.0,0.0);
	glPointSize (3.0);
	gluOrtho2D (0.0,950.0,0.0,950.0);
}

int main (int argc,char ** argv) {
	glutInit (&argc,argv);
	glutInitDisplayMode (GLUT_SINGLE|GLUT_RGB);
	glutInitWindowSize (500,500);
	glutInitWindowPosition (0,0);
	glutCreateWindow ("POINTS");
	glutDisplayFunc (display);
	myinit ();
	glutMainLoop ();
	return 0;
}
