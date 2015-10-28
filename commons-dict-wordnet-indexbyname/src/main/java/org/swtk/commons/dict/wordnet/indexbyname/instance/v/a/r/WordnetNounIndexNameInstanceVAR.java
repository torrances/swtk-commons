package org.swtk.commons.dict.wordnet.indexbyname.instance.v.a.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVAR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"var\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13666611\"]}");
	add("{\"term\":\"vara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13674279\"]}");
	add("{\"term\":\"varan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01697350\"]}");
	add("{\"term\":\"varanidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01697071\"]}");
	add("{\"term\":\"varanus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01697199\"]}");
	add("{\"term\":\"vardenafil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04528723\"]}");
	add("{\"term\":\"varese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11380529\"]}");
	add("{\"term\":\"vargas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11380739\"]}");
	add("{\"term\":\"variability\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04779129\", \"04742473\"]}");
	add("{\"term\":\"variable\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07285985\", \"09492282\", \"05866043\", \"09492089\"]}");
	add("{\"term\":\"variableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04742473\"]}");
	add("{\"term\":\"variance\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00195818\", \"01144471\", \"04742473\", \"04756982\", \"06034344\", \"07196502\", \"07381227\"]}");
	add("{\"term\":\"variant\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05849159\", \"05872761\", \"08128123\", \"07381227\"]}");
	add("{\"term\":\"variate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05872761\"]}");
	add("{\"term\":\"variation\", \"synsetCount\":11, \"upperType\":\"NOUN\", \"ids\":[\"00196043\", \"00530138\", \"10361391\", \"11435198\", \"13593527\", \"13916003\", \"04528994\", \"05849159\", \"07043499\", \"00195818\", \"07351990\"]}");
	add("{\"term\":\"varicella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14156457\"]}");
	add("{\"term\":\"varicocele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14596848\"]}");
	add("{\"term\":\"varicosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14596977\"]}");
	add("{\"term\":\"varicosity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14597098\"]}");
	add("{\"term\":\"variedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04742796\"]}");
	add("{\"term\":\"variegation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00196418\", \"04743068\"]}");
	add("{\"term\":\"varietal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07916465\"]}");
	add("{\"term\":\"variety\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04759289\", \"05847533\", \"07033353\", \"08118051\", \"04758560\", \"08415730\"]}");
	add("{\"term\":\"variola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14147905\"]}");
	add("{\"term\":\"variolation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00826275\"]}");
	add("{\"term\":\"variolization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00826275\"]}");
	add("{\"term\":\"variometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04529158\"]}");
	add("{\"term\":\"variorum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06603004\"]}");
	add("{\"term\":\"varix\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14597258\"]}");
	add("{\"term\":\"varlet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10410785\", \"10556285\"]}");
	add("{\"term\":\"varment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01318779\"]}");
	add("{\"term\":\"varmint\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01318779\", \"10768174\"]}");
	add("{\"term\":\"varna\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08323595\", \"08732799\"]}");
	add("{\"term\":\"varnish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04529282\"]}");
	add("{\"term\":\"varnisher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10766128\"]}");
	add("{\"term\":\"varro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11381034\"]}");
	add("{\"term\":\"varsity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08097529\", \"08304103\"]}");
	add("{\"term\":\"varuna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09552766\"]}");
	add("{\"term\":\"varus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14492454\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }