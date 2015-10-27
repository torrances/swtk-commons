package org.swtk.commons.dict.wordnet.index.name.instance.s.h.o.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHOW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"show\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00756620\", \"06631572\", \"06892571\", \"00521313\"]}");
	add("{\"term\":\"showboat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04215827\"]}");
	add("{\"term\":\"showcase\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02978671\", \"14539684\"]}");
	add("{\"term\":\"showdown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07195703\"]}");
	add("{\"term\":\"shower\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"08272716\", \"10090370\", \"07378268\", \"11522915\", \"00258447\", \"04216003\"]}");
	add("{\"term\":\"showerhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04216450\"]}");
	add("{\"term\":\"showgirl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09940359\"]}");
	add("{\"term\":\"showiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04707284\"]}");
	add("{\"term\":\"showing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00522265\", \"06901395\"]}");
	add("{\"term\":\"showjumping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00451984\"]}");
	add("{\"term\":\"showman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10613153\", \"10613451\"]}");
	add("{\"term\":\"showmanship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05647885\"]}");
	add("{\"term\":\"showpiece\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03073571\"]}");
	add("{\"term\":\"showplace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08666492\"]}");
	add("{\"term\":\"showroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04216878\"]}");
	add("{\"term\":\"showstopper\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04697291\", \"06905397\"]}");
	add("{\"term\":\"showtime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15290329\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }