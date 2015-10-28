package org.swtk.commons.dict.wordnet.indexbyname.instance.m.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"munch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00843054\", \"11216198\"]}");
	add("{\"term\":\"munchausen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11216295\"]}");
	add("{\"term\":\"munchener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07903279\"]}");
	add("{\"term\":\"muncher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10358104\"]}");
	add("{\"term\":\"munchhausen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11216295\"]}");
	add("{\"term\":\"muncie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09108512\"]}");
	add("{\"term\":\"munda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06949600\"]}");
	add("{\"term\":\"mundaneness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04802000\", \"04887468\"]}");
	add("{\"term\":\"mundanity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04802000\", \"04887468\"]}");
	add("{\"term\":\"mung\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07741018\", \"12598760\", \"12599160\"]}");
	add("{\"term\":\"munggo\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07741018\", \"12599160\"]}");
	add("{\"term\":\"munich\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08792060\"]}");
	add("{\"term\":\"municipality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08242502\", \"08643858\"]}");
	add("{\"term\":\"munificence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04839947\"]}");
	add("{\"term\":\"muniments\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06558922\"]}");
	add("{\"term\":\"munition\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03390403\", \"03805132\", \"04573543\"]}");
	add("{\"term\":\"munj\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12153668\"]}");
	add("{\"term\":\"munja\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12153668\"]}");
	add("{\"term\":\"munjeet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12681806\"]}");
	add("{\"term\":\"munjuk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06997406\"]}");
	add("{\"term\":\"munro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11216617\"]}");
	add("{\"term\":\"muntiacus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02437465\"]}");
	add("{\"term\":\"muntingia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12214481\"]}");
	add("{\"term\":\"muntjac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02437585\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }