#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>

struct thread_data
{
    int info;
};

int SharedVariable = 0;

/* Function executed by all threads */

void *SimpleThread(void *data)
{
     int num, val;

     struct thread_data *node = data;

     for (num = 0; num < 20; num++)
     {
          if (random() > RAND_MAX / 2)

             {usleep(500);}

          val = SharedVariable;

          printf("*** thread %d sees value %d\n", node->info, val);

          SharedVariable = val + 1;
     }

     val = SharedVariable;

     printf("Thread %d sees final value %d\n", node->info, val);

     free(balo);

     return NULL;
}

int main(int argc , char *argv[])
{
     int num_threads;

     float num;

     /* We make sure that the input is only an integer */

     num=atoi(argv[1]);

     int output;

     output = num;

     if ((output - num) != 0)
     {
          printf("Please enter an integer value\n");
          exit(-1);
     }

     if(num < 0)
     {
          printf ("Please enter a non negative number \n");exit(-1);
     }

     if (num == 0)
     {
          printf ("Please enter number greater than 0  \n");exit(-1);
     }

     num_threads = num;

     pthread_t threads[num_threads];

     int rc;

     int i;

     /* We initialize a thread structure and create pthreads */

     struct thread_data *node;

     for (i = 0; i < num_threads; i++)
     {

          node = malloc(sizeof(struct thread_data));

          node->info = i;


          rc= pthread_create(&threads[i], NULL, SimpleThread, node);

          if (rc)
          {
            printf("Error in creating thread,return code is %d\n", rc);

            return 0;
          }
     }

     /* We join all threads created and exit the program */

     for (i = 0; i < num_threads; i++)
     {
        pthread_join(threads[i], NULL);
     }
}

