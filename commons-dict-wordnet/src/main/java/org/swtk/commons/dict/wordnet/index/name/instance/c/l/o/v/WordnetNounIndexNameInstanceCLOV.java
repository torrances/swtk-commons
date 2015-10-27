package org.swtk.commons.dict.wordnet.index.name.instance.c.l.o.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLOV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"clove\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07830463\", \"07834398\", \"12360043\", \"12360348\"]}");
	add("{\"term\":\"clover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11773047\"]}");
	add("{\"term\":\"cloverleaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03057148\"]}");
	add("{\"term\":\"cloveroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12653287\"]}");
	add("{\"term\":\"clovis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10922924\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }