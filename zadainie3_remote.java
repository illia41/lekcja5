package sample;

public class Remote
{


    TV tv = new TV();


    public void tv_on()

    {

        if (tv.on == false)

        {


            tv.on = true;

                     System.out.println("tv is turned on");


        }

        else

            {


                       tv.on = false;


            System.out.println("TV is turned off");


        }


    }

             public void channel(String up_or_down)


    {



                if (tv.check_tv_on() == true)


        {




                            if ((up_or_down == "plus") && (tv.channel < 20) && (tv.channel > 1))


            {

                         tv.channel++;


            }


                            else if ((up_or_down == "minus") && (tv.channel > 1) && (tv.channel < 10) )


            {


                      tv.channel--;


            }
                           System.out.println("channel is "+ tv.channel);


        }


    }


    public void volume(String up_or_down)


    {

        if (tv.check_tv_on() == true)

        {



                     if ((up_or_down == "plus") && (tv.volume < 10))

            {

                tv.volume++;


            }

                                 else if ((up_or_down == "minus") && (tv.volume > 1))

            {

                tv.volume--;

            }


                             System.out.println("volume is: "+ tv.volume);

        }

    }
}