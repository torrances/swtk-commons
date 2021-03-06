package org.swtk.commons.dict.wordnet.indexbyname.instance.o.c.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOCC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"occam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11231507\"]}");
	add("{\"term\":\"occasion\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"14508648\", \"15270640\", \"09202161\", \"07461861\", \"07431314\"]}");
	add("{\"term\":\"occasions\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05992828\"]}");
	add("{\"term\":\"occident\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08700127\", \"08700313\"]}");
	add("{\"term\":\"occidental\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06910250\", \"10389544\"]}");
	add("{\"term\":\"occidentalism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05175454\", \"06167773\"]}");
	add("{\"term\":\"occipital bone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05549505\"]}");
	add("{\"term\":\"occipital cortex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05502017\"]}");
	add("{\"term\":\"occipital gyrus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05496883\"]}");
	add("{\"term\":\"occipital lobe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05502017\"]}");
	add("{\"term\":\"occipital protuberance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05549685\"]}");
	add("{\"term\":\"occipital vein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05382204\"]}");
	add("{\"term\":\"occipitomastoid suture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05552358\"]}");
	add("{\"term\":\"occiput\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05548609\"]}");
	add("{\"term\":\"occitan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06978970\"]}");
	add("{\"term\":\"occluded front\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11481479\"]}");
	add("{\"term\":\"occlusion\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01076618\", \"02856708\", \"05075097\", \"11481479\", \"14124251\"]}");
	add("{\"term\":\"occlusive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07130622\"]}");
	add("{\"term\":\"occult\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00413585\", \"09527009\"]}");
	add("{\"term\":\"occult arts\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00413585\"]}");
	add("{\"term\":\"occultation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07383246\"]}");
	add("{\"term\":\"occultism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05977155\", \"05977317\"]}");
	add("{\"term\":\"occultist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10390080\"]}");
	add("{\"term\":\"occupancy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00087629\", \"01056259\"]}");
	add("{\"term\":\"occupancy rate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13840763\"]}");
	add("{\"term\":\"occupant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10543112\"]}");
	add("{\"term\":\"occupation\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"15166446\", \"00087629\", \"00583905\", \"01135427\", \"00583425\"]}");
	add("{\"term\":\"occupation licence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06563489\"]}");
	add("{\"term\":\"occupation license\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06563489\"]}");
	add("{\"term\":\"occupational disease\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14102975\"]}");
	add("{\"term\":\"occupational group\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08420588\"]}");
	add("{\"term\":\"occupational hazard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14566460\"]}");
	add("{\"term\":\"occupational safety and health act\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06547643\"]}");
	add("{\"term\":\"occupational safety and health administration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08366065\"]}");
	add("{\"term\":\"occupational therapy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00665820\"]}");
	add("{\"term\":\"occupier\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10389654\", \"10543112\"]}");
	add("{\"term\":\"occurrence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13982355\", \"07298313\"]}");
	add("{\"term\":\"occurrent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07298313\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }