package org.swtk.commons.dict.wordnet.index.name.instance.r.o.s.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceROSA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12640792\"]}");
	add("{\"term\":\"rosacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14245834\"]}");
	add("{\"term\":\"rosaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12640067\"]}");
	add("{\"term\":\"rosales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12639703\"]}");
	add("{\"term\":\"rosario\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08731238\"]}");
	add("{\"term\":\"rosary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04116429\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }