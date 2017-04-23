public class PhraseOMatic {
  public static void main (String[] args) {

  //3 sets of word to choose from
  String[] wordListOne = {"24/7","multi-tier","30,000 foot","B-to-B","win-win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
  String[] wordListTwo = {"empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","outside-the-box","positioned","networked","focused","leveraged","aligned","targeted","shared","cooperative","accelerated"};
  String[] wordListThree = {"process","tipping-point","solution","architecture","sore competency","strategy","mindshare","portal","space","vision","paradigm","mission"};

  //find ou how many words are in each
  int oneLength = wordListOne.length;
  int twoLength = wordListTwo.length;
  int threeLength = wordListThree.length;

  //generate 3 random numbers
  int rand1 = (int) (Math.random() * oneLength);
  int rand2 = (int) (Math.random() * twoLength);
  int rand3 = (int) (Math.random() * threeLength);

  //now build a phrase
  String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

  //print out phrase
  System.out.println("What we need is a " + phrase + " gizmo!");
  System.out.println("---------------------------------------");
  }
}
