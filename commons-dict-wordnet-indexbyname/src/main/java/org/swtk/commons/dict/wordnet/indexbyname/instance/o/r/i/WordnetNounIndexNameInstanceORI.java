package org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceORI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"oriel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03860853\"]}");
	add("{\"term\":\"orient\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08579780\", \"08580157\"]}");
	add("{\"term\":\"orientalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05175590\", \"06167901\"]}");
	add("{\"term\":\"orientalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10403388\"]}");
	add("{\"term\":\"orientation\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00893192\", \"05684599\", \"06210079\", \"13850288\", \"06217756\", \"01054296\"]}");
	add("{\"term\":\"orifice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05257118\"]}");
	add("{\"term\":\"oriflamme\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03860984\", \"06822149\"]}");
	add("{\"term\":\"origami\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00938272\"]}");
	add("{\"term\":\"origanum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12873840\"]}");
	add("{\"term\":\"origen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11236552\"]}");
	add("{\"term\":\"origin\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"08118903\", \"13580380\", \"06018435\", \"07338522\", \"04930920\", \"08524579\"]}");
	add("{\"term\":\"original\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05947118\", \"03732765\"]}");
	add("{\"term\":\"originalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05955083\"]}");
	add("{\"term\":\"originality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04807608\", \"05642458\"]}");
	add("{\"term\":\"origination\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00241051\", \"07338522\"]}");
	add("{\"term\":\"originator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10403515\"]}");
	add("{\"term\":\"orinasal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07134066\"]}");
	add("{\"term\":\"orinase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04456097\"]}");
	add("{\"term\":\"orinoco\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09402850\"]}");
	add("{\"term\":\"oriole\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01574545\", \"01578386\"]}");
	add("{\"term\":\"oriolidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01578218\"]}");
	add("{\"term\":\"oriolus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01578582\"]}");
	add("{\"term\":\"orion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09403029\", \"09594871\"]}");
	add("{\"term\":\"orison\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07203790\"]}");
	add("{\"term\":\"orissa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08925826\"]}");
	add("{\"term\":\"orites\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12242460\"]}");
	add("{\"term\":\"oriya\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06983797\", \"09695612\"]}");
	add("{\"term\":\"orizaba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08762704\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }