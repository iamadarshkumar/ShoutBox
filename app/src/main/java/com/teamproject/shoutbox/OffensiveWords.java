package com.teamproject.shoutbox;

/**
 * This file is only a block-list of the most abusive and the offensive words. This file is meant only for the sake of filtering abusive words from a user input.
 * You don't need to view this file if you aren't a developer or are underage.
 * This file contain no targeted offence to anyone. It is built for a reason stated above.
 * This file is supposed to be in a form of Json on cloud in the future.
 */

public class OffensiveWords {

    public String[] getOffensive() {
        String offensive[] =
                {
                        "shit", "kutta", "kamina", "chod", "rand","raand",
                        "bhosdi", "bhonsdi", "fuck", "lund", "laura", "lauda", "loda",
                        "chut", "choot","chut","laand","gaand","jhaant","jhant","ass",
                        "chud","bur","chuchi","choochi","pussy","randa", "butt",
                        "bitch","bastard","hentai","dick","oppai","bobba","boobs","anal","lola","weenie","boner",
                        "gand","hijra","bhosadi","douche","scumbag","lawd","loura",
                        "lowde","lawde","laure","laude"
                };
        return offensive;
    };
}
