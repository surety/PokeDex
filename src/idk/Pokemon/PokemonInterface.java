
// Author: Zeus
// March 2021

package Pokemon;

// Interface (package-private) providing the specifications for the Pokemon class.
interface Pokemon extends Comparable<Pokemon> {

  // Accessors and getters
  public int getNationalNumber();
  public String getName();
  public String getElementType();
  public String getRegion();
  public Entry[] getEntries();

}
