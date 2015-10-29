package org.swtk.commons.dict.wordnet.indexbyname.instance.n.e.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNET {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"net\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"03825135\", \"03825694\", \"03825858\", \"13279261\", \"03825534\", \"03585784\"]}");
	add("{\"term\":\"net ball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00570110\"]}");
	add("{\"term\":\"net estate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13272323\"]}");
	add("{\"term\":\"net income\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13279261\"]}");
	add("{\"term\":\"net melon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07772617\", \"12185687\"]}");
	add("{\"term\":\"net profit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13279261\"]}");
	add("{\"term\":\"net sales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13282006\"]}");
	add("{\"term\":\"net ton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13743634\"]}");
	add("{\"term\":\"netball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00483133\"]}");
	add("{\"term\":\"nether region\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05637465\"]}");
	add("{\"term\":\"netherlander\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09732504\"]}");
	add("{\"term\":\"netherlands\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08968866\"]}");
	add("{\"term\":\"netherlands antilles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08766332\"]}");
	add("{\"term\":\"netherlands guiana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09053122\"]}");
	add("{\"term\":\"netherworld\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05637164\"]}");
	add("{\"term\":\"netkeeper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00465105\", \"10153521\"]}");
	add("{\"term\":\"netminder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10153521\"]}");
	add("{\"term\":\"netscape\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06584038\"]}");
	add("{\"term\":\"netted melon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07772617\", \"12185687\"]}");
	add("{\"term\":\"netting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00911084\", \"03434824\"]}");
	add("{\"term\":\"nettle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12412587\"]}");
	add("{\"term\":\"nettle family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12412262\"]}");
	add("{\"term\":\"nettle rash\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14345675\"]}");
	add("{\"term\":\"nettle tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12429736\"]}");
	add("{\"term\":\"nettleleaf goosefoot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11850514\"]}");
	add("{\"term\":\"network\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03826268\", \"03826490\", \"03825135\", \"03826014\", \"08451269\"]}");
	add("{\"term\":\"network architecture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06738429\"]}");
	add("{\"term\":\"network army\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07965746\"]}");
	add("{\"term\":\"network programming\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06497731\"]}");
	add("{\"term\":\"network topology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05738310\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }