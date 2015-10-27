package org.swtk.commons.dict.wordnet.index.name.instance.t.h.o.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTHOR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"thor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09606681\"]}");
	add("{\"term\":\"thoracentesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00946112\"]}");
	add("{\"term\":\"thoracocentesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00946112\"]}");
	add("{\"term\":\"thoracotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00699601\"]}");
	add("{\"term\":\"thorax\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02668173\", \"05560240\", \"05561251\"]}");
	add("{\"term\":\"thorazine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03026858\"]}");
	add("{\"term\":\"thoreau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11360987\"]}");
	add("{\"term\":\"thorite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15094933\"]}");
	add("{\"term\":\"thorium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14682288\"]}");
	add("{\"term\":\"thorn\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06853492\", \"13110391\", \"05840108\"]}");
	add("{\"term\":\"thornbill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01837181\"]}");
	add("{\"term\":\"thorndike\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11361132\", \"11361262\"]}");
	add("{\"term\":\"thorniness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04650754\", \"04956976\"]}");
	add("{\"term\":\"thornton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11361369\"]}");
	add("{\"term\":\"thoroughbred\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01326240\", \"02385883\", \"10729007\"]}");
	add("{\"term\":\"thoroughfare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04433753\"]}");
	add("{\"term\":\"thoroughness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04680215\"]}");
	add("{\"term\":\"thoroughwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11989400\"]}");
	add("{\"term\":\"thorpe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11361474\"]}");
	add("{\"term\":\"thorshavn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08972802\"]}");
	add("{\"term\":\"thortveitite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15095117\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }