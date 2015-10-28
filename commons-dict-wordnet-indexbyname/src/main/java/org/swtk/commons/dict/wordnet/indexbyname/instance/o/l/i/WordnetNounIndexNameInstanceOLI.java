package org.swtk.commons.dict.wordnet.indexbyname.instance.o.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOLI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"olibanum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14898102\"]}");
	add("{\"term\":\"oligarch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10396884\"]}");
	add("{\"term\":\"oligarchy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08379382\"]}");
	add("{\"term\":\"oligo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14993642\"]}");
	add("{\"term\":\"oligocene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15150631\"]}");
	add("{\"term\":\"oligochaeta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01937653\"]}");
	add("{\"term\":\"oligochaete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01937817\"]}");
	add("{\"term\":\"oligoclase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14889467\"]}");
	add("{\"term\":\"oligodactyly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14184147\"]}");
	add("{\"term\":\"oligodendria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05476175\"]}");
	add("{\"term\":\"oligodendrocyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05476391\"]}");
	add("{\"term\":\"oligodendroglia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05476175\"]}");
	add("{\"term\":\"oligodontia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14184268\"]}");
	add("{\"term\":\"oligomenorrhea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13545394\"]}");
	add("{\"term\":\"oligonucleotide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14993642\"]}");
	add("{\"term\":\"oligoplites\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02580163\"]}");
	add("{\"term\":\"oligopoly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14468291\"]}");
	add("{\"term\":\"oligoporus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13072626\"]}");
	add("{\"term\":\"oligosaccharide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14993432\"]}");
	add("{\"term\":\"oligospermia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14595199\"]}");
	add("{\"term\":\"oliguria\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13545498\", \"14530750\"]}");
	add("{\"term\":\"olimbos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09401441\"]}");
	add("{\"term\":\"olive\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04981607\", \"07783320\", \"12321555\", \"12321697\", \"12321962\"]}");
	add("{\"term\":\"olivenite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14708433\"]}");
	add("{\"term\":\"oliver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11234143\"]}");
	add("{\"term\":\"olivier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11234310\"]}");
	add("{\"term\":\"olivine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14708272\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }