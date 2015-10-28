package org.swtk.commons.dict.wordnet.indexbyname.instance.l.e.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03702700\"]}");
	add("{\"term\":\"lemaireocereus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11869079\"]}");
	add("{\"term\":\"lemaitre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11145636\"]}");
	add("{\"term\":\"lemanderin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12732158\"]}");
	add("{\"term\":\"lemma\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06356061\", \"13176246\", \"06764547\"]}");
	add("{\"term\":\"lemming\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02347180\"]}");
	add("{\"term\":\"lemmon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11145830\"]}");
	add("{\"term\":\"lemmus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02347437\"]}");
	add("{\"term\":\"lemna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11815260\"]}");
	add("{\"term\":\"lemnaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11814736\"]}");
	add("{\"term\":\"lemniscate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13925772\"]}");
	add("{\"term\":\"lemniscus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05483214\"]}");
	add("{\"term\":\"lemnos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08808600\"]}");
	add("{\"term\":\"lemon\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03661164\", \"05724289\", \"12732356\", \"04973720\", \"07765558\"]}");
	add("{\"term\":\"lemonade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07942490\"]}");
	add("{\"term\":\"lemongrass\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12124901\", \"15126734\"]}");
	add("{\"term\":\"lemonwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12690564\", \"12690774\"]}");
	add("{\"term\":\"lempira\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13707070\"]}");
	add("{\"term\":\"lemur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02499544\"]}");
	add("{\"term\":\"lemuridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02500039\"]}");
	add("{\"term\":\"lemuroidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02499207\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }