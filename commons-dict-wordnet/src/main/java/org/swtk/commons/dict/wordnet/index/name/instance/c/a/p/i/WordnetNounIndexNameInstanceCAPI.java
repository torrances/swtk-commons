package org.swtk.commons.dict.wordnet.index.name.instance.c.a.p.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCAPI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"capibara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02368132\"]}");
	add("{\"term\":\"capillarity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11453920\"]}");
	add("{\"term\":\"capillary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05433487\", \"02959505\"]}");
	add("{\"term\":\"capital\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"02959683\", \"07297634\", \"08374056\", \"08535930\", \"06837277\", \"08535783\", \"13374622\", \"13375435\"]}");
	add("{\"term\":\"capitalisation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00093826\", \"00953737\", \"00954325\", \"06414068\"]}");
	add("{\"term\":\"capitalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08381070\"]}");
	add("{\"term\":\"capitalist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09632262\", \"09911714\"]}");
	add("{\"term\":\"capitalization\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00093826\", \"00953737\", \"00954325\", \"06414068\"]}");
	add("{\"term\":\"capitate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05280722\"]}");
	add("{\"term\":\"capitation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13335248\"]}");
	add("{\"term\":\"capitol\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02959936\", \"02960135\"]}");
	add("{\"term\":\"capitonidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01844752\"]}");
	add("{\"term\":\"capitulation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00068527\", \"06479539\", \"06482913\"]}");
	add("{\"term\":\"capitulum\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13148915\", \"13154372\", \"13154545\"]}");
	add("{\"term\":\"capiz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01965429\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }