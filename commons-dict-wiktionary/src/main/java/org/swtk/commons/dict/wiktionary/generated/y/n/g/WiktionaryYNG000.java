package org.swtk.commons.dict.wiktionary.generated.y.n.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYNG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yngling", "{\"term\":\"yngling\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Norwegian\", \"old norse\", \"Swedish\"], \"text\":\"From Norwegian \u0027yngling\u0027 Swedish \u0027yngling\u0027 (lang\u003dsv) from Old norse \u0027ungr\u0027 (young) + \u0027-lingr\u0027 (\u0027diminutiv. Noun|diminutive suffix\u0027, compare \u0027-ling\u0027), also a \u0027surname\u0027 in Old Norse\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A type of two-man keelboat from Norway\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1994\u0027\u0027, Richard Sherwood, \u0027A Field Guide to Sailboats of North America\u0027, page 108\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027Yngling\u0027\u0027 is highly stable, with a beam-to-waterline ratio of .37 and with 50 percent of the weight in ballast\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, \u0027The Engineering of Sport: 5: Volume 1\u0027, published by the International Sports Engineering Association, page 606\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"of the \u0027\u0027Yngling\u0027\u0027 was calculated based on the known mass of the boat, including all equipment, and an estimation of the mass of the three female crew members. A triangular surface mesh was constructed on the Yngling geometry, with computational cells clustered and refined in regions of predominant interest and high surface curvature eg keel/rudder leading and trailing edges\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2008\u0027\u0027 (or \u0027\u00272004\u0027\u0027 August 23?), Ron Pattenden, \u0027Land on my right: Solo sail round Britain on a Laser\u0027, Lulu.com, ISBN 9781409216537, [http://books.google.com/books?id\u003dzEPCJMIucnsC\u0026amp;pg\u003dPA91\u0026amp;dq\u003dyngling page 91\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"And what a terrific performance by our girls in the \u0027\u0027Yngling\u0027\u0027. A strange name - do you Yngle it or sail it\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"2009\u0027\u0027, Garry Hoyt, \u0027Go for the Green: The New Case for Sail and Solar Power\u0027, page 35\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"For example, to insist on the inclusion of female match racing in \u0027\u0027Ynglings\u0027\u0027 amounts to a foolish fixation on an arcane and visually unexciting aspect of the sport\", \"priority\":9}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }