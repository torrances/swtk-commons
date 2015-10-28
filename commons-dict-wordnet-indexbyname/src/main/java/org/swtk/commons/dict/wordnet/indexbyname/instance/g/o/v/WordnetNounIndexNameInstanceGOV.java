package org.swtk.commons.dict.wordnet.indexbyname.instance.g.o.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGOV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"governance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01127115\", \"08181484\"]}");
	add("{\"term\":\"governed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08178157\"]}");
	add("{\"term\":\"governess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10159689\"]}");
	add("{\"term\":\"governing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01127115\"]}");
	add("{\"term\":\"government\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06157599\", \"05671515\", \"01127115\", \"08067430\"]}");
	add("{\"term\":\"governor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03454962\", \"10159834\"]}");
	add("{\"term\":\"governorship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00593910\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }