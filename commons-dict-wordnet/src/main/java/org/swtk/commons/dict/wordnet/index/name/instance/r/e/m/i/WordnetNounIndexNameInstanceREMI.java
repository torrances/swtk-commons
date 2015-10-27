package org.swtk.commons.dict.wordnet.index.name.instance.r.e.m.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREMI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"remicade\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03574837\", \"15054589\"]}");
	add("{\"term\":\"remilegia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02578086\"]}");
	add("{\"term\":\"remilitarisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01161030\"]}");
	add("{\"term\":\"remilitarization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01161030\"]}");
	add("{\"term\":\"reminder\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09791278\", \"05821727\", \"06518748\"]}");
	add("{\"term\":\"reminiscence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05769556\", \"05770845\"]}");
	add("{\"term\":\"remise\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01177135\", \"03059842\", \"04081988\"]}");
	add("{\"term\":\"remission\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00095060\", \"00122926\", \"13320476\", \"07434560\"]}");
	add("{\"term\":\"remissness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04673773\"]}");
	add("{\"term\":\"remit\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00122926\", \"05824016\"]}");
	add("{\"term\":\"remitment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00122926\", \"13320476\"]}");
	add("{\"term\":\"remittal\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00095060\", \"07434560\", \"13320476\"]}");
	add("{\"term\":\"remittance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13320476\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }