/* LEXi program to eliminate comment lines in a C program  and copy the resulting program into a separate file. */

%{
    #include<stdio.h>
%}


%%
"//".* ;
"*/".*[ \n\t*a-zA-Z0-9]*.*"*/" ;
%%

int main()
{
    yyin=fopen("demo.c","r");
    yyout=fopen("demo1.c","w");
    yylex();
    printf("Ouput updated in \"demo1.c\" file\n");
    fclose(yyin);
    fclose(yyout);
    return 0;
}

/* The demo.c file is the input file and the output is stored in demo1.c file */
