package org.swtk.commons.dict.wordnet.index.name.instance.s.e.v.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSEVE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"seven\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04185123\", \"13767056\"]}");
	add("{\"term\":\"sevener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13767056\"]}");
	add("{\"term\":\"sevens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00493508\"]}");
	add("{\"term\":\"sevensome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08004236\"]}");
	add("{\"term\":\"seventeen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13769865\"]}");
	add("{\"term\":\"seventeenth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13870762\"]}");
	add("{\"term\":\"seventh\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06873099\", \"13760183\", \"13869695\"]}");
	add("{\"term\":\"seventies\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15175453\", \"15175578\"]}");
	add("{\"term\":\"seventieth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13871591\"]}");
	add("{\"term\":\"seventy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13772034\"]}");
	add("{\"term\":\"severalty\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13261869\", \"14437907\"]}");
	add("{\"term\":\"severance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00360318\", \"07328414\"]}");
	add("{\"term\":\"severeness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04647089\", \"04705014\", \"04717403\", \"05043870\"]}");
	add("{\"term\":\"severing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00360318\"]}");
	add("{\"term\":\"severity\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04647089\", \"04705014\", \"04717403\", \"05043870\"]}");
	add("{\"term\":\"severn\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09453675\", \"09453894\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }