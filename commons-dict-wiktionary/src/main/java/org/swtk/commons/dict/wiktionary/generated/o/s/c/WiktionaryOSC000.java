package org.swtk.commons.dict.wiktionary.generated.o.s.c;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOSC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("oscillation", "{\"term\":\"oscillation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Latin\"], \"text\":\"From French \u0027oscillation\u0027 from Latin \u0027oscillatio\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the act of oscillating or the state of being oscillate\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a regular periodic fluctuation in value about some mea\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"a single such cycl\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"defined for each point \u0026lt;math\u0026gt;x\u0026lt;/math\u0026gt; in the domain of the function by \u0026lt;math\u0026gt; inf left { mathrm{diam}(f(U)) mid U mathrm{ is a neighborhood of }x right }\u0026lt;/math\u0026gt;, and describes the difference (possibly ∞) between the limit superior and limit inferior of the function near that point\", \"priority\":4}]}, \"synonyms\":{}}");

	add("oscillometry", "{\"term\":\"oscillometry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The measurement of oscillations\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oscilloscope", "{\"term\":\"oscilloscope\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An electronic measuring instrument that creates a visible two-dimensional graph, on a screen, of one or more continuously varying voltages or currents\", \"priority\":1}]}, \"synonyms\":{}}");

	add("osculation", "{\"term\":\"osculation\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{m|la|ōsculātiō||a kissing}}, from \u0027osculor\u0027 (i kiss)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"File:Osculating thumb|osculation of a circle and a curve \u0027C\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The action of kissin\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A kis\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A close contac\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A contact between curves or surfaces, at which point they have a common tangen\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Determining whether a number is divisible by another by means of certain operations on its digits\", \"priority\":6}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }