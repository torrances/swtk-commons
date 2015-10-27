package org.swtk.commons.dict.wordnet.index.name.instance.d.o.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDOME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dome\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03225216\", \"03225395\", \"05547087\", \"13894711\"]}");
	add("{\"term\":\"domestic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10043844\"]}");
	add("{\"term\":\"domestication\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00195106\", \"04913019\", \"13490157\"]}");
	add("{\"term\":\"domesticity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00409896\", \"05216381\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }