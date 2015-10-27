package org.swtk.commons.dict.wordnet.index.name.instance.c.l.u.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLUB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"club\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"02934801\", \"03057773\", \"03451003\", \"03058296\", \"03057459\", \"08244135\", \"08096490\"]}");
	add("{\"term\":\"clubbing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14326367\"]}");
	add("{\"term\":\"clubfoot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14238066\"]}");
	add("{\"term\":\"clubhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03451212\"]}");
	add("{\"term\":\"clubhouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03058296\"]}");
	add("{\"term\":\"clubroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03058476\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }