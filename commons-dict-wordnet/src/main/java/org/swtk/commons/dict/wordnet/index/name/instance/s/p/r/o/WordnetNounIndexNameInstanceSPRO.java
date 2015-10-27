package org.swtk.commons.dict.wordnet.index.name.instance.s.p.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPRO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sprocket\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03068939\", \"04296828\", \"04296965\"]}");
	add("{\"term\":\"sprog\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10660621\", \"10660699\"]}");
	add("{\"term\":\"sprout\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07735182\", \"13185481\"]}");
	add("{\"term\":\"sprouting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13508410\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }