/* OPENGL PROGRAM TO BUILD A SIMPLE HOUSE LIKE STRUCTURE */

#include <GL/glut.h>
#include <stdio.h>

void display(){
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1.0,0.0,0.0);
	glPointSize(2.0);
	glBegin(GL_QUADS);
	glVertex2f(2.0,1.0);
	glVertex2f(2.0,-1.5);
	glVertex2f(-2.0,-1.5);
	glVertex2f(-2.0,1.0);
	glEnd();
	glBegin(GL_TRIANGLES);
	glColor3f(0.0,1.0,0.0);
	glVertex2i(-3,1);
	glVertex2i(3,1);
	glVertex2i(0,3);
	glEnd();
	glBegin(GL_QUADS);
	glColor3f(0.0,1.0,0.1);
	glVertex2f(0.5,0.0);
	glVertex2f(0.5,-1.5);
	glVertex2f(-0.5,-1.5);
	glVertex2f(-0.5,0.0);
	glColor3f(0.0,1.0,1.0);
	glVertex2f(-1.5,0.5);
	glVertex2f(-1.0,0.5);
	glVertex2f(-1.0,0.0);
	glVertex2f(-1.5,0.0);
	glEnd();
	glFlush();
}

void myinit(){
	glClearColor(0.0,0.0,0.0,1.0);
	gluOrtho2D(-5.0,5.0,-5.0,5.0);
}

int main(int argc,char ** argv){
	glutInit(&argc,argv);
	glutInitDisplayMode(GLUT_RGB|GLUT_SINGLE);
	glutInitWindowSize(500,500);
	glutInitWindowPosition(0,0);
	glutCreateWindow("SIMPLE HOUSE");
	myinit();
	glutDisplayFunc(display);
	glutMainLoop();
}
