package org.swtk.commons.dict.wordnet.indexbyname.instance.j.o.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJOI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"join\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08015154\", \"13934166\"]}");
	add("{\"term\":\"joiner\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10243539\", \"10243664\"]}");
	add("{\"term\":\"joinery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00618841\", \"03605935\"]}");
	add("{\"term\":\"joining\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00146038\"]}");
	add("{\"term\":\"joint\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03606019\", \"03606190\", \"07596347\", \"13934166\", \"03606548\", \"05602838\"]}");
	add("{\"term\":\"jointer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03606851\"]}");
	add("{\"term\":\"jointure\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00382488\", \"13285241\"]}");
	add("{\"term\":\"jointworm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02220491\"]}");
	add("{\"term\":\"joist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03607053\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }