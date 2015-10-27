package org.swtk.commons.dict.wordnet.index.name.instance.s.o.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSOLA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"solace\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01214157\", \"14469627\", \"07507795\"]}");
	add("{\"term\":\"solacement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07507795\", \"14469627\"]}");
	add("{\"term\":\"solan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02056079\"]}");
	add("{\"term\":\"solanaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12912986\"]}");
	add("{\"term\":\"solandra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12934405\"]}");
	add("{\"term\":\"solanopteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13199398\"]}");
	add("{\"term\":\"solanum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12913854\"]}");
	add("{\"term\":\"solarisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05051538\"]}");
	add("{\"term\":\"solarium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04364012\"]}");
	add("{\"term\":\"solarization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05051538\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }