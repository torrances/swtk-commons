package org.swtk.commons.dict.wordnet.index.name.instance.d.i.g.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDIGI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"digit\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05573730\", \"13675079\", \"13763162\"]}");
	add("{\"term\":\"digitalin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15084698\"]}");
	add("{\"term\":\"digitalis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12903539\", \"15084698\"]}");
	add("{\"term\":\"digitalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00711096\"]}");
	add("{\"term\":\"digitalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00711096\"]}");
	add("{\"term\":\"digitaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12137398\"]}");
	add("{\"term\":\"digitigrade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02509779\"]}");
	add("{\"term\":\"digitisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05811220\"]}");
	add("{\"term\":\"digitiser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03202130\"]}");
	add("{\"term\":\"digitization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05811220\"]}");
	add("{\"term\":\"digitizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03202130\"]}");
	add("{\"term\":\"digitoxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03202350\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }