package org.swtk.commons.dict.wordnet.indexbyname.instance.g.i.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGIR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"giraffa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02441528\"]}");
	add("{\"term\":\"giraffa camelopardalis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02441664\"]}");
	add("{\"term\":\"giraffe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02441664\"]}");
	add("{\"term\":\"giraffidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02441405\"]}");
	add("{\"term\":\"girandola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03442739\"]}");
	add("{\"term\":\"girandole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03442739\"]}");
	add("{\"term\":\"girard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11021049\"]}");
	add("{\"term\":\"girasol\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12000184\", \"14893067\"]}");
	add("{\"term\":\"giraudoux\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11021207\"]}");
	add("{\"term\":\"girder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03442851\"]}");
	add("{\"term\":\"girdle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03117520\", \"03442981\", \"05586542\"]}");
	add("{\"term\":\"giriama\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07005768\"]}");
	add("{\"term\":\"girl\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10149967\", \"10150206\", \"10012375\", \"10104064\", \"10149362\"]}");
	add("{\"term\":\"girl friday\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10150104\"]}");
	add("{\"term\":\"girl scout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10150536\"]}");
	add("{\"term\":\"girl scouts\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08488196\"]}");
	add("{\"term\":\"girl wonder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10150671\"]}");
	add("{\"term\":\"girlfriend\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10150206\", \"10150397\"]}");
	add("{\"term\":\"girlhood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15172290\"]}");
	add("{\"term\":\"girlishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04675390\"]}");
	add("{\"term\":\"giro\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08072073\", \"13403939\"]}");
	add("{\"term\":\"giro account\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13381114\"]}");
	add("{\"term\":\"giro cheque\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13403939\"]}");
	add("{\"term\":\"girolamo savonarola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11302792\"]}");
	add("{\"term\":\"gironde\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08277141\"]}");
	add("{\"term\":\"girondin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10150788\"]}");
	add("{\"term\":\"girondism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05971033\"]}");
	add("{\"term\":\"girondist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10150788\"]}");
	add("{\"term\":\"girru\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09541441\"]}");
	add("{\"term\":\"girth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03035741\", \"05108669\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }