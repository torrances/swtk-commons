package org.swtk.commons.dict.wordnet.index.name.instance.r.a.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRAIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rail\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02017595\", \"04053683\", \"04470914\", \"04053903\", \"04054513\"]}");
	add("{\"term\":\"railbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10524678\"]}");
	add("{\"term\":\"railcar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02963378\"]}");
	add("{\"term\":\"railhead\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04054403\", \"04054251\"]}");
	add("{\"term\":\"railing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04054845\", \"04054513\"]}");
	add("{\"term\":\"raillery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06790633\"]}");
	add("{\"term\":\"railroad\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04055187\", \"04055680\"]}");
	add("{\"term\":\"railroader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10742407\"]}");
	add("{\"term\":\"railroading\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00953148\"]}");
	add("{\"term\":\"rails\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04470914\"]}");
	add("{\"term\":\"railway\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04055187\", \"04055680\"]}");
	add("{\"term\":\"railwayman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10742407\"]}");
	add("{\"term\":\"railyard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04618511\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }