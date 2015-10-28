package org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceADD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"add\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14079762\"]}");
	add("{\"term\":\"addax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02423782\"]}");
	add("{\"term\":\"addend\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13750928\"]}");
	add("{\"term\":\"addendum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06411274\"]}");
	add("{\"term\":\"adder\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01755226\", \"02681996\", \"09788176\"]}");
	add("{\"term\":\"addict\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09788253\", \"09788499\"]}");
	add("{\"term\":\"addiction\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00088669\", \"07501285\", \"14086207\"]}");
	add("{\"term\":\"addition\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00873785\", \"08572409\", \"13274322\", \"13776433\", \"00364614\", \"02682269\"]}");
	add("{\"term\":\"additive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02682642\"]}");
	add("{\"term\":\"addlehead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10618312\"]}");
	add("{\"term\":\"address\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"04849463\", \"05089855\", \"06800007\", \"06807073\", \"07081631\", \"07253354\", \"08508037\", \"06367922\"]}");
	add("{\"term\":\"addressee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09788768\"]}");
	add("{\"term\":\"addressograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02682815\"]}");
	add("{\"term\":\"adducer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09788948\"]}");
	add("{\"term\":\"adducing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06662449\"]}");
	add("{\"term\":\"adduct\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14608196\"]}");
	add("{\"term\":\"adduction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00334029\"]}");
	add("{\"term\":\"adductor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05299227\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }