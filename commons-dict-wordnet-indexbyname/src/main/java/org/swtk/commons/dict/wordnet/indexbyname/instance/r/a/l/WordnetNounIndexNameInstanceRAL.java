package org.swtk.commons.dict.wordnet.indexbyname.instance.r.a.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRAL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07405840\"]}");
	add("{\"term\":\"ralegh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11272617\"]}");
	add("{\"term\":\"raleigh\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09150517\", \"11272617\"]}");
	add("{\"term\":\"rallidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02017300\"]}");
	add("{\"term\":\"rally\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01169007\", \"07473948\", \"13567048\", \"00046387\", \"08375259\"]}");
	add("{\"term\":\"rallying\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00046387\", \"01233174\"]}");
	add("{\"term\":\"rallying cry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07138112\", \"07167460\"]}");
	add("{\"term\":\"rallying point\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06619420\"]}");
	add("{\"term\":\"ralph barton perry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11250659\"]}");
	add("{\"term\":\"ralph bunche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10890857\"]}");
	add("{\"term\":\"ralph ellison\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10978174\"]}");
	add("{\"term\":\"ralph johnson bunche\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10890857\"]}");
	add("{\"term\":\"ralph richardson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11281174\"]}");
	add("{\"term\":\"ralph vaughan williams\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11381580\"]}");
	add("{\"term\":\"ralph waldo ellison\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10978174\"]}");
	add("{\"term\":\"ralph waldo emerson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10978544\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }