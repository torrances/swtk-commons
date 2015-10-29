package org.swtk.commons.dict.wordnet.indexbyname.instance.g.l.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGLY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"glyburide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03446854\"]}");
	add("{\"term\":\"glyceraldehyde\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14908971\"]}");
	add("{\"term\":\"glyceria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12142641\"]}");
	add("{\"term\":\"glyceria grandis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12142959\"]}");
	add("{\"term\":\"glyceric acid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14909114\"]}");
	add("{\"term\":\"glyceric aldehyde\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14908971\"]}");
	add("{\"term\":\"glyceride\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14909239\"]}");
	add("{\"term\":\"glycerin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14909835\"]}");
	add("{\"term\":\"glycerin jelly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910188\"]}");
	add("{\"term\":\"glycerinated gelatin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910008\"]}");
	add("{\"term\":\"glycerine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14909835\"]}");
	add("{\"term\":\"glycerite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910331\"]}");
	add("{\"term\":\"glycerogel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910448\"]}");
	add("{\"term\":\"glycerogelatin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910448\"]}");
	add("{\"term\":\"glycerol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14909835\"]}");
	add("{\"term\":\"glycerol trimargarate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15104012\"]}");
	add("{\"term\":\"glycerol tripalmitate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15104622\"]}");
	add("{\"term\":\"glycerol tristearate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15105509\"]}");
	add("{\"term\":\"glycerole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910331\"]}");
	add("{\"term\":\"glyceryl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910594\"]}");
	add("{\"term\":\"glyceryl ester\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14911177\"]}");
	add("{\"term\":\"glyceryl trinitrate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14910730\"]}");
	add("{\"term\":\"glycine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12552513\", \"14631171\"]}");
	add("{\"term\":\"glycine max\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12552673\"]}");
	add("{\"term\":\"glycogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14819919\"]}");
	add("{\"term\":\"glycogenesis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07430562\", \"13509701\"]}");
	add("{\"term\":\"glycol\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14860150\", \"14876037\"]}");
	add("{\"term\":\"glycolic acid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14912275\"]}");
	add("{\"term\":\"glycollic acid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14912275\"]}");
	add("{\"term\":\"glycolysis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13509809\"]}");
	add("{\"term\":\"glycoprotein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14912461\"]}");
	add("{\"term\":\"glycoside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14911456\"]}");
	add("{\"term\":\"glycosuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14291343\"]}");
	add("{\"term\":\"glycyrrhiza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12553225\"]}");
	add("{\"term\":\"glycyrrhiza glabra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12553391\"]}");
	add("{\"term\":\"glycyrrhiza lepidota\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12553695\"]}");
	add("{\"term\":\"glyoxaline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14940821\"]}");
	add("{\"term\":\"glyph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03447088\"]}");
	add("{\"term\":\"glyptic art\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03447212\"]}");
	add("{\"term\":\"glyptics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03447411\"]}");
	add("{\"term\":\"glyptography\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00938010\", \"03447212\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }