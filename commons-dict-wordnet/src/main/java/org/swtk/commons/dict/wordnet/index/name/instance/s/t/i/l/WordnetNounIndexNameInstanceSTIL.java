package org.swtk.commons.dict.wordnet.index.name.instance.s.t.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"stilbesterol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03198566\"]}");
	add("{\"term\":\"stilbestrol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14774301\"]}");
	add("{\"term\":\"stilboestrol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14774301\"]}");
	add("{\"term\":\"stile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04325925\"]}");
	add("{\"term\":\"stiletto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04326030\"]}");
	add("{\"term\":\"still\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03217532\", \"04326120\", \"04989727\", \"04326386\"]}");
	add("{\"term\":\"stillbirth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00231342\"]}");
	add("{\"term\":\"stillness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14029664\", \"14546411\", \"04989727\"]}");
	add("{\"term\":\"stillroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04326683\"]}");
	add("{\"term\":\"stilt\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02037315\", \"02038707\", \"04327075\", \"03942545\"]}");
	add("{\"term\":\"stiltbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02037315\"]}");
	add("{\"term\":\"stilton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07868205\"]}");
	add("{\"term\":\"stilwell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11338457\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }