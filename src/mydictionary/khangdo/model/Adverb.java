/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary.khangdo.model;

/**
 * A class defines an adverb
 *
 * @author Khang Do, 2020
 */
public class Adverb extends Word {
    
    /**
     * A no-args constructor of the adverb
     */
    public Adverb() {
        super();
    }
    
    /**
     * Print the Adverb
     * @return string represent the information of the adverb
     */
    @Override
    public String toString() {
        
        return String.format("The Adverb: %s, pronunciation: %s, definition: "
                + "%s, frequency: %s, synonym: %s, antonym: %s, "
                + "related form: %s.\n",
                super.getWord(), super.getPron(), 
                super.getMeanings(), super.getFreq(), super.getSynonym(), 
                super.getRelatedForm());
    }
    
    /**
     * Compare 2 adverbs
     * @param o the adverb that we need to compare
     * @return true if 2 adverbs are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o instanceof Adverb) {
            Adverb c = (Adverb) o;
            return super.getWord() == c.getWord();
        } else {
            return false;
        }
    }

    /**
     * To compare 2 adverbs which one is higher
     * @param adv the adverb that we want to compare with
     * @return 1 if this adverb is higher, 0 is equal and -1 if less than
     */    
    public int compareTo(Adverb adv) {
        return super.getWord().compareToIgnoreCase(adv.getWord());
    }
}
