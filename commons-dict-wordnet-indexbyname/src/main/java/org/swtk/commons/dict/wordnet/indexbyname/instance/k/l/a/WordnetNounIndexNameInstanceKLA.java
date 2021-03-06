package org.swtk.commons.dict.wordnet.indexbyname.instance.k.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKLA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"klaipeda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09036436\"]}");
	add("{\"term\":\"klamath\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09349373\"]}");
	add("{\"term\":\"klamath falls\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09156338\"]}");
	add("{\"term\":\"klamath river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09349373\"]}");
	add("{\"term\":\"klammath weed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12389826\"]}");
	add("{\"term\":\"klan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08046174\"]}");
	add("{\"term\":\"klansman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10257373\"]}");
	add("{\"term\":\"klaproth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11126642\"]}");
	add("{\"term\":\"klaus fuchs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11004585\"]}");
	add("{\"term\":\"klavern\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08046537\"]}");
	add("{\"term\":\"klavier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03043000\"]}");
	add("{\"term\":\"klaxon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03627267\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }