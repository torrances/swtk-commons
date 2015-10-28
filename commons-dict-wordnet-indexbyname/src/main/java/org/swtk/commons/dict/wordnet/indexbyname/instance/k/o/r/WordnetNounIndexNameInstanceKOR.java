package org.swtk.commons.dict.wordnet.indexbyname.instance.k.o.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKOR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13638327\"]}");
	add("{\"term\":\"koran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06473279\"]}");
	add("{\"term\":\"korbut\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11129182\"]}");
	add("{\"term\":\"korchnoi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11129279\"]}");
	add("{\"term\":\"korda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11129414\"]}");
	add("{\"term\":\"kordofan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09052466\"]}");
	add("{\"term\":\"kordofanian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07004282\"]}");
	add("{\"term\":\"kore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09592596\"]}");
	add("{\"term\":\"korea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08974384\"]}");
	add("{\"term\":\"korean\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06941948\", \"09738332\"]}");
	add("{\"term\":\"korinthos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08804284\"]}");
	add("{\"term\":\"koruna\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13703380\", \"13703766\"]}");
	add("{\"term\":\"korzybski\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11129553\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }