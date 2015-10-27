package org.swtk.commons.dict.wordnet.index.name.instance.b.r.i.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRIS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01033424\"]}");
	add("{\"term\":\"brisance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11432293\"]}");
	add("{\"term\":\"brisbane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08851869\"]}");
	add("{\"term\":\"brisket\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07673156\"]}");
	add("{\"term\":\"briskness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04640320\"]}");
	add("{\"term\":\"brisling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02535549\", \"07814961\"]}");
	add("{\"term\":\"briss\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01033424\"]}");
	add("{\"term\":\"bristle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01904251\", \"02905839\"]}");
	add("{\"term\":\"bristlegrass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12155003\"]}");
	add("{\"term\":\"bristletail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02272852\"]}");
	add("{\"term\":\"bristliness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04956976\"]}");
	add("{\"term\":\"bristol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08898935\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }