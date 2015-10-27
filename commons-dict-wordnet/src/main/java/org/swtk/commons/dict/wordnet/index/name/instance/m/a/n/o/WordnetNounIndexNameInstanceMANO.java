package org.swtk.commons.dict.wordnet.index.name.instance.m.a.n.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMANO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"manoeuvrability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04781437\"]}");
	add("{\"term\":\"manoeuvre\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00060372\", \"00169058\", \"00557350\", \"00962103\", \"05913746\"]}");
	add("{\"term\":\"manoeuvrer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10310083\"]}");
	add("{\"term\":\"manometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03723874\"]}");
	add("{\"term\":\"manor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13273067\", \"03723997\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }