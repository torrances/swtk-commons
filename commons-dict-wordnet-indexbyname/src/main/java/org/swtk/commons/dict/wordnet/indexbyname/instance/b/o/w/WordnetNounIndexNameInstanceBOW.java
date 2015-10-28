package org.swtk.commons.dict.wordnet.indexbyname.instance.b.o.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBOW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bow\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00548802\", \"02883550\", \"07244001\", \"07289130\", \"13918793\", \"02882960\", \"02883250\", \"02882759\", \"02883431\"]}");
	add("{\"term\":\"bowditch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10879081\"]}");
	add("{\"term\":\"bowdler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10879265\"]}");
	add("{\"term\":\"bowdlerisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00397633\", \"00397999\"]}");
	add("{\"term\":\"bowdleriser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10093780\"]}");
	add("{\"term\":\"bowdlerism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00398353\"]}");
	add("{\"term\":\"bowdlerization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00397633\", \"00397999\"]}");
	add("{\"term\":\"bowdlerizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10093780\"]}");
	add("{\"term\":\"bowel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05541966\"]}");
	add("{\"term\":\"bowels\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08533732\"]}");
	add("{\"term\":\"bower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02735832\"]}");
	add("{\"term\":\"bowerbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01603298\"]}");
	add("{\"term\":\"bowery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09144603\"]}");
	add("{\"term\":\"bowfin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02641717\"]}");
	add("{\"term\":\"bowhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02066653\"]}");
	add("{\"term\":\"bowie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10879453\"]}");
	add("{\"term\":\"bowiea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12465171\"]}");
	add("{\"term\":\"bowing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00102230\", \"07289130\"]}");
	add("{\"term\":\"bowknot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02883431\"]}");
	add("{\"term\":\"bowl\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00105229\", \"02884638\", \"02884787\", \"02885542\", \"04303019\", \"13787671\", \"02884182\", \"13916387\", \"02884435\"]}");
	add("{\"term\":\"bowlder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09250746\"]}");
	add("{\"term\":\"bowleg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05569467\"]}");
	add("{\"term\":\"bowler\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02884998\", \"09889367\", \"09889502\"]}");
	add("{\"term\":\"bowlful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13787671\"]}");
	add("{\"term\":\"bowline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02885147\"]}");
	add("{\"term\":\"bowling\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00042478\", \"00105796\", \"00462843\"]}");
	add("{\"term\":\"bowls\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00463865\"]}");
	add("{\"term\":\"bowman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09824747\"]}");
	add("{\"term\":\"bowsprit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02886245\"]}");
	add("{\"term\":\"bowstring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02886342\"]}");
	add("{\"term\":\"bowtie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02886446\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }