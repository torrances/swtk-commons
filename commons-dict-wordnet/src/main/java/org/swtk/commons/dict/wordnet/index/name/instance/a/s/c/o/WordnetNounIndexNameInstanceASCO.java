package org.swtk.commons.dict.wordnet.index.name.instance.a.s.c.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceASCO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ascocarp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11553267\"]}");
	add("{\"term\":\"ascolichen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13008183\"]}");
	add("{\"term\":\"ascoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11553923\"]}");
	add("{\"term\":\"ascomycete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13044772\"]}");
	add("{\"term\":\"ascomycetes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13044543\"]}");
	add("{\"term\":\"ascomycota\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13044052\"]}");
	add("{\"term\":\"ascomycotina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13044052\"]}");
	add("{\"term\":\"ascophyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01408083\"]}");
	add("{\"term\":\"ascospore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13112999\"]}");
	add("{\"term\":\"ascot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02750068\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }