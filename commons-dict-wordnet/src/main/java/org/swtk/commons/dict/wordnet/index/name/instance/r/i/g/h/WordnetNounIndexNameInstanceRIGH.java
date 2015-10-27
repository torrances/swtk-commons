package org.swtk.commons.dict.wordnet.index.name.instance.r.i.g.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRIGH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"right\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"13362771\", \"04857572\", \"00351826\", \"05572970\", \"08433609\", \"04098951\", \"08642648\", \"05182180\"]}");
	add("{\"term\":\"righteousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04833466\"]}");
	add("{\"term\":\"rightfield\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00726149\", \"04098951\"]}");
	add("{\"term\":\"rightfulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04857572\"]}");
	add("{\"term\":\"righthander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10550534\"]}");
	add("{\"term\":\"rightism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06230394\"]}");
	add("{\"term\":\"rightist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10550802\"]}");
	add("{\"term\":\"rightness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04721129\", \"04809447\", \"04906208\", \"04854364\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }