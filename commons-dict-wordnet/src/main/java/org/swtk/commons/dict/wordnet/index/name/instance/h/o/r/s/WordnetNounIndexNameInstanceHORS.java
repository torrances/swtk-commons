package org.swtk.commons.dict.wordnet.index.name.instance.h.o.r.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHORS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"horse\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03629976\", \"04147696\", \"08414813\", \"03543217\", \"02377103\"]}");
	add("{\"term\":\"horseback\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09327282\", \"01904915\"]}");
	add("{\"term\":\"horsebean\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12518174\", \"12596828\"]}");
	add("{\"term\":\"horsebox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03543359\"]}");
	add("{\"term\":\"horsecar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03543480\"]}");
	add("{\"term\":\"horsecloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03543722\"]}");
	add("{\"term\":\"horsefish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02580864\"]}");
	add("{\"term\":\"horseflesh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07682151\"]}");
	add("{\"term\":\"horsefly\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02198178\", \"02201511\"]}");
	add("{\"term\":\"horsehair\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03543997\", \"14932735\"]}");
	add("{\"term\":\"horsehead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02580864\"]}");
	add("{\"term\":\"horsehide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14786937\"]}");
	add("{\"term\":\"horselaugh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07142619\"]}");
	add("{\"term\":\"horseleech\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01941376\"]}");
	add("{\"term\":\"horseman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10205301\", \"10205412\"]}");
	add("{\"term\":\"horsemanship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05646219\"]}");
	add("{\"term\":\"horsemeat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07682151\"]}");
	add("{\"term\":\"horsemint\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12876646\", \"12879378\", \"12879747\"]}");
	add("{\"term\":\"horseplay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00514772\"]}");
	add("{\"term\":\"horsepond\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09328552\"]}");
	add("{\"term\":\"horsepower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13666489\"]}");
	add("{\"term\":\"horseradish\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07840359\", \"11893442\", \"11893651\"]}");
	add("{\"term\":\"horseshit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06623729\"]}");
	add("{\"term\":\"horseshoe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03544613\", \"03544726\"]}");
	add("{\"term\":\"horseshoer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10099457\"]}");
	add("{\"term\":\"horseshoes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00468388\"]}");
	add("{\"term\":\"horseshow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00520635\"]}");
	add("{\"term\":\"horsetail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13240320\"]}");
	add("{\"term\":\"horseweed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11976817\", \"12865169\"]}");
	add("{\"term\":\"horsewhip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03544934\"]}");
	add("{\"term\":\"horsewhipping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01165919\"]}");
	add("{\"term\":\"horsewoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10205762\"]}");
	add("{\"term\":\"horst\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09328634\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }