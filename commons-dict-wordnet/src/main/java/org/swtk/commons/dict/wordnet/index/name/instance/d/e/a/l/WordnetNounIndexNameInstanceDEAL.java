package org.swtk.commons.dict.wordnet.index.name.instance.d.e.a.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEAL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"deal\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"01086561\", \"01087261\", \"07307886\", \"07973501\", \"15124824\", \"15127189\", \"13796604\", \"06783960\", \"01112179\"]}");
	add("{\"term\":\"dealer\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10016174\", \"10494031\", \"10741119\", \"08080282\", \"10740102\"]}");
	add("{\"term\":\"dealership\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08077029\"]}");
	add("{\"term\":\"dealfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02549258\"]}");
	add("{\"term\":\"dealignment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13477079\"]}");
	add("{\"term\":\"dealing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01108713\", \"01137693\"]}");
	add("{\"term\":\"dealings\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01108713\", \"13802661\", \"00041542\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }