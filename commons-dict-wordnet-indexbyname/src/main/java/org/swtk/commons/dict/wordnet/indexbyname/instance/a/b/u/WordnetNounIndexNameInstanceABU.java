package org.swtk.commons.dict.wordnet.indexbyname.instance.a.b.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceABU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"abu dhabi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09067011\"]}");
	add("{\"term\":\"abu nidal organization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08036995\"]}");
	add("{\"term\":\"abu sayyaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08027291\"]}");
	add("{\"term\":\"abudefduf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02609975\"]}");
	add("{\"term\":\"abudefduf saxatilis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02610100\"]}");
	add("{\"term\":\"abuja\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08996541\"]}");
	add("{\"term\":\"abukir\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09209122\"]}");
	add("{\"term\":\"abukir bay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09209122\"]}");
	add("{\"term\":\"abulia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14049648\"]}");
	add("{\"term\":\"abundance\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13842212\", \"13842451\", \"05122340\"]}");
	add("{\"term\":\"abuse\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00949535\", \"06728162\", \"00420921\"]}");
	add("{\"term\":\"abuser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09777974\"]}");
	add("{\"term\":\"abutilon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12193232\"]}");
	add("{\"term\":\"abutilon theophrasti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12193586\"]}");
	add("{\"term\":\"abutment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02671925\", \"08638338\"]}");
	add("{\"term\":\"abutment arch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02672072\"]}");
	add("{\"term\":\"abutter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09778112\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }