package org.swtk.commons.dict.wordnet.index.name.instance.g.l.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGLUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"glucagon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05417474\"]}");
	add("{\"term\":\"glucinium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14655473\"]}");
	add("{\"term\":\"gluck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11022544\"]}");
	add("{\"term\":\"glucocorticoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14776236\"]}");
	add("{\"term\":\"glucophage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03759186\"]}");
	add("{\"term\":\"glucosamine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14776502\"]}");
	add("{\"term\":\"glucose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14908271\"]}");
	add("{\"term\":\"glucoside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14911952\"]}");
	add("{\"term\":\"glucosuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14291224\"]}");
	add("{\"term\":\"glucotrol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03444948\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }