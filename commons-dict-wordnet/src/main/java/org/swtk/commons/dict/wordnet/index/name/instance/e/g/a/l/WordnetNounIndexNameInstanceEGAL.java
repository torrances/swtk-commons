package org.swtk.commons.dict.wordnet.index.name.instance.e.g.a.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEGAL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"egalitarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10066678\"]}");
	add("{\"term\":\"egalitarianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05976455\"]}");
	add("{\"term\":\"egalite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13970190\"]}");
	add("{\"term\":\"egality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13970190\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }